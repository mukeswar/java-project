class Student {
   class Collage {
      public void displayInfo() {
        System.out.println("I am a Collage Student.");
      }
   }
   static class Bachlor {
      public void displayInfo() {
        System.out.println("I am a Bachlor student.");
      }
   }
}

class Main {
   public static void main(String[] args) {
      Student student = new Student();

      Student.Collage collage = student.new Collage();
      collage.displayInfo();

      Student.Bachlor bachlor = new Student.Bachlor();
      bachlor.displayInfo();

   }
}