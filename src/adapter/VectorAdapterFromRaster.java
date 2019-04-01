package adapter;

public class VectorAdapterFromRaster extends RasterGrapphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drewRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
