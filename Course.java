public class Course {

        private String courseName;
        private int maxStudents;
        private double qualityRatingOutOf10;
        private String professorName;
        private boolean isOnline;

        // Constructor
        public Course(String courseName, int maxStudents, double qualityRatingOutOf10,
                      String professorName, boolean isOnline) {
            this.courseName = courseName;
            this.maxStudents = maxStudents;
            this.qualityRatingOutOf10 = qualityRatingOutOf10;
            this.professorName = professorName;
            this.isOnline = isOnline;
        }

        // Getters and setters
        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getMaxStudents() {
            return maxStudents;
        }

        public void setMaxStudents(int maxStudents) {
            this.maxStudents = maxStudents;
        }

        public double getQualityRatingOutOf10() {
            return qualityRatingOutOf10;
        }

        public void setQualityRatingOutOf10(double qualityRatingOutOf10) {
            this.qualityRatingOutOf10 = qualityRatingOutOf10;
        }

        public String getProfessorName() {
            return professorName;
        }

        public void setProfessorName(String professorName) {
            this.professorName = professorName;
        }

        public boolean isOnline() {
            return isOnline;
        }

        public void setOnline(boolean isOnline) {
            this.isOnline = isOnline;
        }
    }

