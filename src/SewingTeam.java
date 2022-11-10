public class SewingTeam {

    public static void main(String[] args) {

        Seamstress [] seamstress = new Seamstress [4];
        seamstress [0] = new Seamstress("Dasha", 18);
        seamstress [1] = new Seamstress("Arina", 21);
        seamstress [2] = new Seamstress("Violetta", 35);
        seamstress [3] = new Seamstress("Anya", 60);
        Team team = new Team("Team1", seamstress);

        Fabrica fabrica = new Fabrica(30);
        String result = fabrica.doIt(team);
        System.out.println(result);
    }
}
