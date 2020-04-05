package com.kodilla.testing.forum.statistics;

public class StatisticsData {
    Statistics statistics;
    int usersNumber;
    int postNumber;
    int commentsNumber;
    double postsAveragePerUser;
    double commentsAveragePerUser;
    double commentsAveragePerPost;

    public StatisticsData (Statistics statistics){
        this.statistics = statistics;
    }
    public int getUsersNumber(){
        return usersNumber;
    }
    public int getPostNumber() {
        return postNumber;
    }
    public int getCommentsNumber(){
        return commentsNumber;
    }

    public double getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }
    public int calculateAverageStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if (usersNumber > 0){
            postsAveragePerUser =postNumber/usersNumber;
            commentsAveragePerUser = commentsNumber / usersNumber;
        }
        if (postNumber > 0){
            commentsAveragePerPost = commentsNumber /(double) postNumber;
        }
        return 0;
    }
    public void showStatistics(){
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average numbers of posts per user: " + postsAveragePerUser);
        System.out.println("Average numbers of comments per user: " + commentsAveragePerUser);
        System.out.println("Average numbers of comments per post: " + commentsAveragePerPost);
    }
}

