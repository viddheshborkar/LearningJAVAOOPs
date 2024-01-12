class SuperAnimal {
    String color = "White";

    void eating() {
        System.out.println("Eating....");
    }
}

    class Dog extends SuperAnimal {
        String color = "Black";

        void eating() {
          //  System.out.println("Eating bread...");
            super.eating();
        }
            void display () {
                //     System.out.println(color);
                System.out.println(super.color);
       }
}
