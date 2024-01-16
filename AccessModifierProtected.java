//The protected modifier is accessible within the package and outside the package but through inheritance only.

class Access {
    protected int a = 30;
    protected void m1() {
        System.out.println(a);
    }
}

