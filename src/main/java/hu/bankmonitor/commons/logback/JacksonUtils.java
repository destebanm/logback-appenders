package hu.bankmonitor.commons.logback;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class JacksonUtils {

	private static final String JODA_MODULE_CLASS_NAME = "com.fasterxml.jackson.datatype.joda.JodaModule";

	public static void registerModulesToObjectMapper(ObjectMapper om) {

		if (ClassUtils.isOnClasspath(JODA_MODULE_CLASS_NAME, JacksonUtils.class.getClassLoader())) {
			JodaModuleRegisterUtil.registerModule(om);
		}
	}

	@UtilityClass
	private static class JodaModuleRegisterUtil {

		public static void registerModule(ObjectMapper om) {

			om.registerModule(new JodaModule());
		}
	}

}
