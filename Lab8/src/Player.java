public class Player {
    private double riskTaking = 0.0;
    private double complexityLiking = 0.0;
    private double workoutLiking = 0.0;
    private double competitiveness = 0.0;
    private Game[] specialLikes;
    private Game[] specialDislikes;

    //constructors:
    public Player(){

    }
    public Player(double rt, double cl, double wl, double c){
        this.riskTaking = rt;
        this.complexityLiking = cl;
        this.workoutLiking = wl;
        this.competitiveness = c;
    }
    public Player(double rt, double cl, double wl, double c, Game[] sl, Game[] sd){
        this.riskTaking = rt ;
        this.complexityLiking = cl ;
        this.workoutLiking = wl ;
        this.competitiveness = c;
        this.specialLikes = sl;
        this.specialDislikes = sd;
    }

    //instance methods;

    //getters
    public double getRiskTaking(){
        return riskTaking;
    }
    public double getComplexityLiking(){
        return complexityLiking;
    }
    public double getWorkoutLiking() {
        return workoutLiking;
    }
    public double getCompetitiveness(){
        return competitiveness;
    }
    public Game[] getSpecialLikes(){
        return specialLikes;
    }
    public Game[] getSpecialDislikes(){
        return specialDislikes;
    }

    //setters;
    public void setSpecialLikes(Game[] specialLikes){
        this.specialLikes = specialLikes;
    }
    public void setSpecialDislikes(Game[] specialDislikes){
        this.specialDislikes = specialDislikes;
    }


}
