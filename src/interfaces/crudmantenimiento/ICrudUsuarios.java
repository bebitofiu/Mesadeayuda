package interfaces.crudmantenimiento;

import Clases.Usuario;
import java.util.List;

/**
 *
 * @author AndroidUnlock
 */
public interface ICrudUsuarios {
    public Usuario getUsuario(Long id);
    public void deleterUsuario(Long id);
    public Usuario updateUsuario(Long id);
}
