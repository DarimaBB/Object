public class Fabrica {
    String result;
    private int planForTheDay;

    public Fabrica(int planForTheDay) {
        this.planForTheDay = planForTheDay;
    }

    public String doIt(Team team) {
        result = "Team1: " + team.getName() + " " + '\n';
        for (Seamstress seamstress : team.getTeams()) {
            result += "Name seamstress: " + seamstress.getName() + " " + '\n';
            int value = seamstress.getSewingSpeed();
            testPlanForTheDay(value);
        }
        return result;
    }

    private void testPlanForTheDay(int value) {
        if (value < planForTheDay) result += "Didn't complete the plan " + '\n';
    }
}