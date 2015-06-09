package hu.bankmonitor.commons.logback;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ClassUtils {

	/**
	 * Check if the given class is on the classpath
	 *
	 * @param name
	 *            The class' name to check
	 * @param classLoader
	 *            The class loader
	 * @return if on classpath <code>true</code>, else <code>false</code>
	 */
	public static boolean isOnClasspath(String name, ClassLoader classLoader) {

		try {
			Class.forName(name, false, classLoader);
			return true;
		} catch (Throwable ex) {
			return false;
		}
	}

}
