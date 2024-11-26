public class Pengein implements Aquatic{
        private String name;
        private int age;
        private String habitat;
        private float swimmingDepth;

        public Pengein(String name, int age, String habitat, float swimmingDepth) {
            this.name = name;
            this.age = age;
            this.habitat = habitat;
            this.swimmingDepth = swimmingDepth;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public String getHabitat() {
            return habitat;
        }

        public float getSwimmingDepth() {
            return swimmingDepth;
        }

        @Override
        public void swim() {
            System.out.println(name + " nage à une profondeur de " + swimmingDepth + " mètres.");
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pengein pengein = (Pengein) obj;
            return age == pengein.age &&
                    Objects.equals(name, pengein.name) &&
                    Objects.equals(habitat, pengein.habitat);
        }
    }


