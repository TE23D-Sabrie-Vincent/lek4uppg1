public class Elev {
    String namn;
    String personNum;
    String email;
    String mobilNum;
    String klass;
    String program;

    public Elev(String namn, String personNum,String email, 
    String mobilNum, String klass, String program){

    this.namn=namn;
    this.personNum = personNum;
    this.email = email;
    this.mobilNum = mobilNum;
    this.klass = klass;
    this.program = program;

    }

    public void skrivUtInfo() {
        System.out.println("\n Elev registrerad");
        System.out.println("Namn: " + namn);
        System.out.println("personNum: " + personNum);
        System.out.println("Email: " + email);
        System.out.println("mobilNum: " + mobilNum);
        System.out.println("Klass: " + klass);
        System.out.println("Program: " + program);
    }
}