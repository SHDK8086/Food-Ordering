package Class;

public class admin {
    private int adminID;
    private String adminName;

    public admin(int adminID, String adminName) {
        this.adminID = adminID;
        this.adminName = adminName;
    }

    public void manageUsers() {
        // Implementation for managing users
    }

    public void configureSystemSettings() {
        // Implementation for configuring system settings
    }

    public void generateReports() {
        // Implementation for generating reports
    }

    // Getters and Setters

    public
    int getAdminID () {
        return adminID;
    }

    public
    void setAdminID (int adminID) {
        this.adminID = adminID;
    }

    public
    String getAdminName () {
        return adminName;
    }

    public
    void setAdminName (String adminName) {
        this.adminName = adminName;
    }
}
