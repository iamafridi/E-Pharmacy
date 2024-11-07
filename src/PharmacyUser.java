public abstract class PharmacyUser {
    protected String name;
    protected String userId;
    protected String userType;

    public PharmacyUser(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public abstract void performAction();
}
