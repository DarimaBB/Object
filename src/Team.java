public class Team {
        private String name;
        private Seamstress[] teams;
        public Team(String name, Seamstress[] teams) {
            this.name = name;
            this.teams = teams;
        }
        public String getName() { return name; }

        public Seamstress[] getTeams() { return teams;}
    }

