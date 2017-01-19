package Capitulo14;

// Uma hierarquia de classes genéricas simples.
class Gene<T> {
    T ob;
    Gene(T o) {
        ob = o;
    }
    //Returna ob.
    T getob() {
        return ob;
    }
}
// Uma subclasse de Gen.
class Gene2<T> extends Gen<T> {
    Gene2(T o) {
        super(o);
    }
}
