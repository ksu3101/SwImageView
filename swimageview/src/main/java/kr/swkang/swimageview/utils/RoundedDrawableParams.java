package kr.swkang.swimageview.utils;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Shader;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.widget.ImageView;

/**
 * @author KangSung-Woo
 * @since 2016/08/03
 */
public class RoundedDrawableParams {
  public static final int   DEFAULT_CLICK_ANIM_DURATION = 100;
  public static final float DEFAULT_CORNER_RADIUS       = 0f;
  public static final float DEFAULT_BORDER_WIDTH        = 0f;
  public static final int   DEFAULT_BORDER_COLOR        = Color.WHITE;
  public static final int   DEFAULT_DIMM_COLOR          = Color.argb(180, 0, 0, 0);
  public static final int   DEFAULT_SHADOW_COLOR        = Color.BLACK; //Color.argb(180, 0, 0, 0);

  private ImageView.ScaleType scaleType;
  @FloatRange(from = 0f)
  private float               cornerRadius;
  private CornerType          cornerType;
  @FloatRange(from = 0f)
  private float               borderWidth;
  private ColorStateList      borderColor;
  private ShapeType           shapeType;
  private Shader.TileMode     tileModeX;
  private Shader.TileMode     tileModeY;
  private ColorStateList      clickHighlightingColor;
  private int                 clickEnterDuration;
  private int                 clickExitDuration;
  private float               shadowRadius;
  private float               shadowDx;
  private float               shadowDy;
  @ColorInt
  private int                 shadowColor;

  public RoundedDrawableParams() {
    // initialize parameters to default value
    this.scaleType = ImageView.ScaleType.CENTER_CROP;
    this.cornerRadius = DEFAULT_CORNER_RADIUS;
    this.cornerType = CornerType.NONE;
    this.borderWidth = DEFAULT_BORDER_WIDTH;
    this.borderColor = ColorStateList.valueOf(DEFAULT_BORDER_COLOR);
    this.shapeType = ShapeType.RECTANGLE;
    this.tileModeX = Shader.TileMode.CLAMP;
    this.tileModeY = Shader.TileMode.CLAMP;
    this.clickHighlightingColor = ColorStateList.valueOf(DEFAULT_DIMM_COLOR);
    this.clickEnterDuration = 100;
    this.clickExitDuration = 100;
    this.shadowRadius = 0f;
    this.shadowDx = 0f;
    this.shadowDy = 0f;
    this.shadowColor = DEFAULT_SHADOW_COLOR;
  }

  public RoundedDrawableParams setBorderColorList(@NonNull ColorStateList colorStateList) {
    this.borderColor = colorStateList;
    return this;
  }

  public RoundedDrawableParams setShapeType(@NonNull ShapeType shapeType) {
    this.shapeType = shapeType;
    return this;
  }

  public RoundedDrawableParams setShadow(float shadowRadius, float shadowDx, float shadowDy, @ColorInt int shadowColor) {
    this.shadowRadius = shadowRadius;
    this.shadowDx = shadowDx;
    this.shadowDy = shadowDy;
    this.shadowColor = shadowColor;
    return this;
  }

  public RoundedDrawableParams setClickHighlightingColor(@FloatRange(from = 0.0f, to = 1.0f) float alpha, @ColorInt int highlightingColor) {
    this.clickHighlightingColor = ColorStateList.valueOf(
        Color.argb((int) (alpha == 0 ? 0 : (alpha * 255)),    // alpha
                   Color.red(highlightingColor),            // RED
                   Color.green(highlightingColor),          // GREEN
                   Color.blue(highlightingColor)            // BLUE
        )
    );
    return this;
  }

  public RoundedDrawableParams setClickEnterAnimDuration(@IntRange(from = 50) int enterAnimDuration) {
    this.clickEnterDuration = enterAnimDuration;
    return this;
  }

  public RoundedDrawableParams setClickExitAnimDuration(@IntRange(from = 50) int exitAnimDuration) {
    this.clickExitDuration = exitAnimDuration;
    return this;
  }

  public ImageView.ScaleType getScaleType() {
    return scaleType;
  }

  public RoundedDrawableParams setScaleType(@NonNull ImageView.ScaleType scaleType) {
    this.scaleType = scaleType;
    return this;
  }

  public RoundedDrawableParams setRoundedCorner(@NonNull CornerType cornerType, @FloatRange(from = 0f) float cornerRadius) {
    this.cornerType = cornerType;
    this.cornerRadius = cornerRadius;
    return this;
  }

  public float getBorderWidth() {
    return borderWidth;
  }

  public RoundedDrawableParams setBorderWidth(@FloatRange(from = 0f) float borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  public ColorStateList getBorderColor() {
    return borderColor;
  }

  public RoundedDrawableParams setBorderColor(@ColorInt int borderColor) {
    this.borderColor = ColorStateList.valueOf(borderColor);
    return this;
  }

  public Shader.TileMode getTileModeX() {
    return tileModeX;
  }

  public RoundedDrawableParams setTileModeX(@NonNull Shader.TileMode tileModeX) {
    this.tileModeX = tileModeX;
    return this;
  }

  public Shader.TileMode getTileModeY() {
    return tileModeY;
  }

  public RoundedDrawableParams setTileModeY(@NonNull Shader.TileMode tileModeY) {
    this.tileModeY = tileModeY;
    return this;
  }

  public ColorStateList getClickHighlightingColor() {
    return clickHighlightingColor;
  }

  public RoundedDrawableParams setClickHighlightingColor(@ColorInt int highlightingColor) {
    this.clickHighlightingColor = ColorStateList.valueOf(highlightingColor);
    return this;
  }

  public int getClickEnterDuration() {
    return clickEnterDuration;
  }

  public int getClickExitDuration() {
    return clickExitDuration;
  }

  public float getCornerRadius() {
    return cornerRadius;
  }

  public CornerType getCornerType() {
    return cornerType;
  }

  public ShapeType getShapeType() {
    return shapeType;
  }

  public float getShadowRadius() {
    return shadowRadius;
  }

  public float getShadowDx() {
    return shadowDx;
  }

  public float getShadowDy() {
    return shadowDy;
  }

  public int getShadowColor() {
    return shadowColor;
  }
}
