package com.jfinal.plugin.app.config;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: honglei.wan
 * @Description:
 * @Date: Create in 2020/6/17 4:04 下午
 */
public class ConfigUtil {

	public static <T> T newInstance(Class<T> clazz) {
		try {
			Constructor constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			return (T) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Method> getClassSetMethods(Class clazz) {
		List<Method> setMethods = new ArrayList<>();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("set")
					&& Character.isUpperCase(method.getName().charAt(3))
					&& method.getName().length() > 3
					&& method.getParameterCount() == 1
					&& Modifier.isPublic(method.getModifiers())
					&& !Modifier.isStatic(method.getModifiers())) {

				setMethods.add(method);
			}
		}
		return setMethods;
	}

	public static String firstCharToLowerCase(String str) {
		char firstChar = str.charAt(0);
		if (firstChar >= 'A' && firstChar <= 'Z') {
			char[] arr = str.toCharArray();
			arr[0] += ('a' - 'A');
			return new String(arr);
		}
		return str;
	}


	private static String rootClassPath;

	public static String getRootClassPath() {
		if (rootClassPath == null) {
			try {
				String path = getClassLoader().getResource("").toURI().getPath();
				rootClassPath = new File(path).getAbsolutePath();
			} catch (Exception e) {
				try {
					String path = ConfigUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath();
					path = java.net.URLDecoder.decode(path, "UTF-8");
					if (path.endsWith(File.separator)) {
						path = path.substring(0, path.length() - 1);
					}
					/*
					 * Fix path 带有文件名
					 */
					if (path.endsWith(".jar")) {
						path = path.substring(0, path.lastIndexOf("/") + 1);
					}
					rootClassPath = path;
				} catch (UnsupportedEncodingException e1) {
					throw new RuntimeException(e1);
				}
			}
		}
		return rootClassPath;
	}


	public static ClassLoader getClassLoader() {
		ClassLoader ret = Thread.currentThread().getContextClassLoader();
		return ret != null ? ret : ConfigUtil.class.getClassLoader();
	}

	public static void doNothing(Throwable ex) {
	}

	public static Object convert(Class<?> convertClass, String s, Type genericType) {

		if (convertClass == String.class || s == null) {
			return s;
		}

		if (convertClass == Integer.class || convertClass == int.class) {
			return Integer.parseInt(s);
		} else if (convertClass == Long.class || convertClass == long.class) {
			return Long.parseLong(s);
		} else if (convertClass == Double.class || convertClass == double.class) {
			return Double.parseDouble(s);
		} else if (convertClass == Float.class || convertClass == float.class) {
			return Float.parseFloat(s);
		} else if (convertClass == Boolean.class || convertClass == boolean.class) {
			String value = s.toLowerCase();
			if ("1".equals(value) || "true".equals(value)) {
				return Boolean.TRUE;
			} else if ("0".equals(value) || "false".equals(value)) {
				return Boolean.FALSE;
			} else {
				throw new RuntimeException("Can not parse to boolean type of value: " + s);
			}
		} else if (convertClass == java.math.BigDecimal.class) {
			return new java.math.BigDecimal(s);
		} else if (convertClass == java.math.BigInteger.class) {
			return new java.math.BigInteger(s);
		} else if (convertClass == byte[].class) {
			return s.getBytes();
		} else if (Map.class.isAssignableFrom(convertClass)) {
			if (!s.contains(":") || !genericClassCheck(genericType)) {
				return null;
			} else {
				Map<String,String> map = convertClass == ConcurrentHashMap.class ? new ConcurrentHashMap<>(1) : new HashMap<>(1);
				String[] strings = s.split(",");
				for (String kv : strings) {
					int indexOf = kv.indexOf(":");
					if (indexOf > 0 && indexOf < kv.trim().length() - 1) {
						map.put(kv.substring(0, indexOf).trim(), kv.substring(indexOf + 1).trim());
					}
				}
				return map;
			}
		} else if (List.class.isAssignableFrom(convertClass)) {
			if (genericClassCheck(genericType)) {
				List<String> list = LinkedList.class == convertClass ? new LinkedList<>() : new ArrayList<>(1);
				String[] strings = s.split(",");
				for (String s1 : strings) {
					if (s1.trim().length() > 0) {
						list.add(s1.trim());
					}
				}
				return list;
			} else {
				return null;
			}
		} else if (Set.class.isAssignableFrom(convertClass)) {
			if (genericClassCheck(genericType)) {
				Set<String> set = LinkedHashSet.class == convertClass ? new LinkedHashSet<>() : new HashSet<>(1);
				String[] strings = s.split(",");
				for (String s1 : strings) {
					if (s1.trim().length() > 0) {
						set.add(s1.trim());
					}
				}
				return set;
			} else {
				return null;
			}
		} else if (convertClass.isArray() && convertClass.getComponentType() == String.class) {
			List<String> list = new LinkedList<>();
			String[] strings = s.split(",");
			if (strings.length > 0) {
				for (String s1 : strings) {
					if (s1 != null && s1.trim().length() != 0) {
						list.add(s1.trim());
					}
				}
			}
			return list.toArray(new String[0]);
		} else if (Class.class == convertClass) {
			try {
				return Class.forName(s, false, Thread.currentThread().getContextClassLoader());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		throw new RuntimeException(convertClass.getName() + " can not be converted, please use other type in your config class!");

	}

	/**
	 * 对泛型类型进行检测，只支持 String 类型的泛型，或者不是泛型才会支持
	 *
	 * @param type
	 * @return
	 */
	private static boolean genericClassCheck(Type type) {
		if (type instanceof ParameterizedType) {
			for (Type at : ((ParameterizedType) type).getActualTypeArguments()) {
				if (String.class != at) {
					return false;
				}
			}
		}
		return true;
	}
}
