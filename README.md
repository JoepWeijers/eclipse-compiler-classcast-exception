# eclipse-compiler-classcast-exception

This project breaks when "Unnecessary cast or 'instanceof' check" is set to 'Warning'.

```
Internal compiler error: java.lang.ClassCastException: class org.eclipse.jdt.internal.compiler.lookup.LocalTypeBinding cannot be cast to class org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding (org.eclipse.jdt.internal.compiler.lookup.LocalTypeBinding and org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding are in unnamed module of loader org.eclipse.osgi.internal.loader.EquinoxClassLoader @345d641e) at org.eclipse.jdt.internal.compiler.ast.AllocationExpression.inferDiamondConstructor(AllocationExpression.java:607)	EclipseCompilerClassCastException.java	/eclipse-compiler-classcastexception/src/main/java/nl/joepweijers	line 0	Java Problem
```
