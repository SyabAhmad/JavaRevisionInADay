class animal{
    public void animalSound(){
        System.out.println("mew mew mew mew");
    }
}
class dog extends animal{
    public void animalSound(){
        System.out.println("ghwab ghwab ghwab");
    }
}
class monkey extends animal {
    public void animalSound(){
        System.out.println("peek peek peek peek");
    }
}
class human extends animal{
    public void animalSound(){
        System.out.println("hello hello hello hello");
    }
}
class OOPsPolymophism {
    public static void main(String []args){
        animal anime=new animal();
        dog anime1=new dog();
        monkey anime2 = new monkey();
        human anime3 = new human();
        anime.animalSound();
        anime1.animalSound();
        anime2.animalSound();
        anime3.animalSound();
    }
}
