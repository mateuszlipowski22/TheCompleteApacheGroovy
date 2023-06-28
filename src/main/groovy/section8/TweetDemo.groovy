package section8

import groovy.transform.Canonical

@Canonical
class Tweet {

    String post;
    String username;
    Date postDateTime;
    
    private List favorites=[];
    private List retweets=[];
    private List mentions=[];
    private List hashtag=[];

    List getFavorites() {
        return favorites;
    }

    void favorites(String username) {
        this.favorites << username;
    }

    void retweet(String username) {
        this.retweets << username;
    }

    List getRetweets() {
        return retweets
    }

    List getMentions() {
        String pattern = /\B@[a-z0-9_-]+/;
        post.findAll(pattern);
    }

    List getHashTags() {
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        post.findAll(pattern);
    }
}

Tweet tweet = new Tweet(post:"This #Groovy and #java course is awsome created by @mateusz @michal", username: "mateusz", postDateTime: new Date());
println tweet;

tweet.favorites("Michal");
tweet.retweet("Michal");

println tweet.favorites;
println tweet.retweets;

println tweet.getHashTags();
println tweet.getMentions();