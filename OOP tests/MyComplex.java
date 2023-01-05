class MyComplex{
    private int img;
    private int comp;
    private int num1;
    private int num2;
    public void setRealPart(int x){
        this.img=x;
    }
    
    public void setImaginaryPart(int y){
        this.comp=y;
    }
    
    public MyComplex add(MyComplex z){
        this.img = img + z.img ;
        this.comp = comp + z.comp ;
        return new MyComplex(this.img , this.comp);
    }
    MyComplex(int p,int q){
        this.num1=p;
        this.num2=q;
    }
    MyComplex(){
        int img;
        int comp;
    }
    public String toString(){
        return num1+" + "+num2+"i";
    }
}