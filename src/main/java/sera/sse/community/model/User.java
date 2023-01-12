package sera.sse.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.ACCOUNT_ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.NAME
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.TOKEN
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.GMT_CREATE
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.GMT_MODIFIED
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.BIO
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.AVATAR_URL
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.ID
     *
     * @return the value of USER1.ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.ID
     *
     * @param id the value for USER1.ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.ACCOUNT_ID
     *
     * @return the value of USER1.ACCOUNT_ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.ACCOUNT_ID
     *
     * @param accountId the value for USER1.ACCOUNT_ID
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.NAME
     *
     * @return the value of USER1.NAME
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.NAME
     *
     * @param name the value for USER1.NAME
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.TOKEN
     *
     * @return the value of USER1.TOKEN
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.TOKEN
     *
     * @param token the value for USER1.TOKEN
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.GMT_CREATE
     *
     * @return the value of USER1.GMT_CREATE
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.GMT_CREATE
     *
     * @param gmtCreate the value for USER1.GMT_CREATE
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.GMT_MODIFIED
     *
     * @return the value of USER1.GMT_MODIFIED
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.GMT_MODIFIED
     *
     * @param gmtModified the value for USER1.GMT_MODIFIED
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.BIO
     *
     * @return the value of USER1.BIO
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.BIO
     *
     * @param bio the value for USER1.BIO
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.AVATAR_URL
     *
     * @return the value of USER1.AVATAR_URL
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.AVATAR_URL
     *
     * @param avatarUrl the value for USER1.AVATAR_URL
     *
     * @mbg.generated Thu Jan 12 16:44:08 CST 2023
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}