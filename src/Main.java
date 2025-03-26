public class Main {
    public static void main(String[] args) {
        Epuletek epuletek = new Epuletek();
        System.out.println(epuletek.atlagmagassag());
        System.out.println(epuletek.legalacsonyabb());
        epuletek.varosok();
        System.out.println("----------------------------------------------------------------");
        epuletek.halmazzalVarosok();
        epuletek.hanyszorSzerepel();
    }

}