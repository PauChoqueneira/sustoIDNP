public class Reloj extends View {
    private Paint paintReloj;
    private  Paint paintText;

    public Reloj(Context context) {
        super(context);
        init();
    }

    public Reloj(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Reloj(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        paintText = new Paint();
        paintReloj = new Paint(Paint.ANTI_ALIAS_FLAG);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawReloj(canvas);
    }


    private void drawReloj(Canvas canvas) {
        RectF rectExt = new RectF();
        rectExt.top = 0f;
        rectExt.bottom = getHeight();
        rectExt.left= getWidth()/2 - getHeight()/2;
        rectExt.right= getWidth()/2 + getHeight()/2;


        paintReloj.setColor(Color.rgb(255,87,51));

        canvas.drawArc(rectExt, 0,360,true,paintReloj);
        paintReloj.setColor(Color.rgb(100,48,37));

        canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/4, paintReloj);

        paintText.setColor(Color.WHITE);
        paintText.setStyle(Paint.Style.FILL);
        paintText.setTextSize(20);
        canvas.drawText("12", getWidth()/2, 0f, paintText);
    }
}