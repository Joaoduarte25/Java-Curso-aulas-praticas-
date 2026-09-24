class Dog2{
    String name;
    public static void main(String[] args){

        // cria uma objeto dog e acesse

        Dog2 d = new Dog2();
        d.bark();
        d.name = "Bart";

        // agora crie uma array dog

        Dog2[] myDogs = new Dog2[3];

        // e insira algumas dog nele

        myDogs[0] = new Dog2();
        myDogs[1] = new Dog2();
        myDogs[2] = d;

        // acesse o dog usando a referencia do array

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // qual o nome do dog 2

        System.out.print(" O ultimo nome do dog é ? ");
        System.out.println(myDogs[2].name);

        // agora itere com o while o array e faz o cachorro latir

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name + " ruff ruff ");
    }
    public void eat(){
    }
    public void chaseCat(){
    }
}