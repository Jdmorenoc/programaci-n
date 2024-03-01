
package characters;

public class Character {
     String name;
       String ocupation;
       int age;
       String phrase;

        public Character(String name, String ocupation, int age, String phrase){
            this.name = name;
            this.ocupation = ocupation;
            this.age = age;
            this.phrase = phrase;
        }
      
        public Character(){}
        
       public void greeting(){
           System.out.println(this.phrase);  
      }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOcupation() {
            return ocupation;
        }

        public void setOcupation(String ocupation) {
            this.ocupation = ocupation;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhrase() {
            return phrase;
        }

        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }
    }
