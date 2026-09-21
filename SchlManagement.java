public class SchlManagement {
    public static void main(String[] args) {
        // Create instances of the existing systems
        GradingSystem gradingSystem = new GradingSystem();
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Create adapters for the existing systems
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Integrate the systems using the adapters
        gradingAdapter.integrateSystem();
        attendanceAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}