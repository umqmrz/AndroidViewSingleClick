# AndroidViewSingleClick
android 防止连击

使用方法
```
view.setOnClickListener(new View.OnClickListener() {
  @SingleClick
  @Override
    public void onClick(View v) {
      num++;
      textView.setText("点击了" + num +"次");
    }
});
```
