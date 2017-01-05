package examC;

public interface Q135 { public void m1(); }
// unimplemented method
// class B implements Q135 { }
 class C implements Q135 { public void m1() { } }
//unimplemented method
 // class D implements Q135 { public void m1(int x) { } }
 abstract class E implements Q135 { }
 abstract class F implements Q135 { public void m1() { } }
 abstract class G implements Q135 { public void m1(int x) { } }