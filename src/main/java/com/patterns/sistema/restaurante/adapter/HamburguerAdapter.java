package com.patterns.sistema.restaurante.adapter;

import com.patterns.sistema.restaurante.model.Pedido;
import com.patterns.sistema.restaurante.exception.RegraNegocioException;
import com.patterns.sistema.restaurante.model.Hamburguer;
import lombok.Data;

@Data
public class HamburguerAdapter extends Pedido {
    private Hamburguer hamburguer;
    public HamburguerAdapter(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    @Override
    public String getDadosImprimir(){
        return toString();
    }

    @Override
    public String toString() {
        return "Pedido" +
                "\n\tcodigo: " + getId() +
                "\n\tmesa: " + (getIdMesa() != null ? getIdMesa() : null) +
                "\n\tHamburguer" +
                "\n\tpicles: " + (isHasPicles() ? "sim" : "não") +
                "\n\tmaionese: " + (hamburguer.isHasMaionese() ? "sim" : "não") +
                "\n\tbatata: " + (isHasBatata() ? "sim" : "não") +
                "\n\tbebida: " + (isHasBebida() ? "sim" : "não") +
                "\n\tfechado: " + (isFechado() ? "sim" : "não");
    }

    //Invalidando propriedades que não vão
    @Override
    public void setHasPolenta(boolean b){
        throw new RegraNegocioException("hamburguer não leva polenta");
    }

    @Override
    public void setHasPalmito(boolean b){
        throw new RegraNegocioException("hamburguer não leva palmito");
    }
    

    @Override
    public boolean isHasPolenta(){
        throw new RegraNegocioException("hamburguer não leva polenta");
    }

    @Override
    public boolean isHasPalmito(){
        throw new RegraNegocioException("hamburguer não leva palmito");
    }
}