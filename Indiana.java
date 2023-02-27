class Indiana {
    private String _titleVO;
    private boolean _viewed;
    private int _yearOfDiffusion;
    private double _noteOfIMDB;


    public Indiana(String titleVO, boolean viewed, int yearOfDiffusion, double noteOfIMDB) {
        this._titleVO = titleVO;
        this._viewed = viewed;
        this._yearOfDiffusion = yearOfDiffusion;
        this._noteOfIMDB = noteOfIMDB;
    }

    public double get_noteOfIMDB() {
        return _noteOfIMDB;
    }

    public void set_noteOfIMDB(double _noteOfIMDB) {
        this._noteOfIMDB = _noteOfIMDB;
    }

    public int get_yearOfDiffusion() {
        return _yearOfDiffusion;
    }

    public void set_yearOfDiffusion(int _yearOfDiffusion) {
        this._yearOfDiffusion = _yearOfDiffusion;
    }

    public boolean is_viewed() {
        return _viewed;
    }

    public void set_viewed(boolean _viewed) {
        this._viewed = _viewed;
    }

    public String get_titleVO() {
        return _titleVO;
    }

    public void set_titleVO(String _titleVO) {
        this._titleVO = _titleVO;
    }

    public static void main(String[] args) {
        Indiana indy = new Indiana("Indiana Jones and the Last Crusade", true, 1989, 8.2);

        System.out.println(indy.get_titleVO());
        System.out.println(indy.is_viewed());
        System.out.println(indy.get_yearOfDiffusion());
        System.out.println(indy.get_noteOfIMDB());
    }
}