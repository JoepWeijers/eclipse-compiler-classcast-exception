package nl.joepweijers.lombok;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EclipseCompilerClassCastException {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		Object foo = "[\"a\",\"b\"]";
		// Breaks when "Unnecessary cast or 'instanceof' check" is set to 'Warning'
		List<String> list = new ObjectMapper().readValue((String)foo, new TypeReference<>() { /*  */ });
		
		// Explicitly typing the TypeReference works around it
//		List<String> list = new ObjectMapper().readValue((String)foo, new TypeReference<List<String>>() { /*  */ });
		System.out.println(list);
	}
}
