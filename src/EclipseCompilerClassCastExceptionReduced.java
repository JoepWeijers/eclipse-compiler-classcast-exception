import java.util.List;

public class EclipseCompilerClassCastExceptionReduced {
	
	public static void main(String[] args) throws Exception {
		List<String> list = null;
		Object foo = "[\"a\",\"b\"]";
		// Breaks when "Unnecessary cast or 'instanceof' check" is set to 'Warning'
		list = new ObjectMapper2().readValue((String)foo, new TypeReference2<>() { /*  */ });
		
		// Commenting out the previous line and explicitly typing the TypeReference works around it
		list = new ObjectMapper2().readValue((String)foo, new TypeReference2<List<String>>() { /*  */ });
		System.out.println(list);
	}
	
	private static class TypeReference2<T> implements Comparable<TypeReference2<T>> {
		@Override
		public int compareTo(TypeReference2<T> o) {
			return 0;
		}
	}

	private static class ObjectMapper2 {
		private <T> T readValue(String content, TypeReference2<T> valueTypeRef) {
			return readValue(content, "");
		}

		private <T> T readValue(String content, String foo) {
			return null;
		}
	}
}
