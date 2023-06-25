package groovy_basics

class Tweet {
    public String username;
    public String text;
    public Integer retweets;
    public Integer favorites;
    public Date createdOn;

    public Tweet(String user, String tweet){
        username = user;
        text=tweet;
        retweets=0;
        favorites=0;
        createdOn=new Date()
    }

    void addToRetweets(){
        retweets+=1;
    }

    void addToFavorites(){
        favorites+=1;
    }


    @Override
    public String toString() {
        return "Tweet{" +
                "username='" + username + '\'' +
                ", text='" + text + '\'' +
                ", retweets=" + retweets +
                ", favorites=" + favorites +
                ", createdOn=" + createdOn +
                '}';
    }
}
