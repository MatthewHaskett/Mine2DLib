/*
MIT License

Copyright (c) 2018 Matthew Haskett

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package me.enderaura.mine2d.frame;

import com.google.common.collect.Sets;
import me.enderaura.mine2d.render.CustomMapRenderer;
import me.enderaura.mine2d.render.Renderable;
import org.bukkit.map.MapView;

import java.util.Set;

/**
 * @author Enderaura
 * @since 19/08/2018 17:40
 */
public class MapFrame implements Frame {

    private final Set<Renderable> renderables = Sets.newHashSet();
    private final MapView mapView;

    MapFrame(MapView mapView){
        this.mapView = mapView;

        mapView.getRenderers().clear();
        mapView.addRenderer(new CustomMapRenderer(this));
    }

    @Override
    public void addRenderable(Renderable renderable) {
        renderables.add(renderable);
    }

    @Override
    public void removeRenderable(Renderable renderable) {
        renderables.remove(renderable);
    }

    @Override
    public Set<Renderable> getRenderables() {
        return renderables;
    }

    public MapView getMapView() {
        return mapView;
    }
}
