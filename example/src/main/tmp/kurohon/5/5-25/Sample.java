public sealed class Sample permits A {
    // something code
}



/*
A. public final class A extends Sample {}
B. public sealed class A extends Sample {}
C. public non-sealed class A extends Sample {}
D. public class A extends Sample {}
*/


// 正解はAとCです。