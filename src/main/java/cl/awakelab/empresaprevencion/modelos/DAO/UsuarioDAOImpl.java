package cl.awakelab.empresaprevencion.modelos.DAO;

import cl.awakelab.empresaprevencion.modelos.Conexion;
import cl.awakelab.empresaprevencion.modelos.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {

        private Connection cn = null;


    @Override
    public void create(Usuario u) {

        String sql = "insert usuario (nombreUsuario, nacimientoUsuario, runUsuario) values ('+" + "'," + u.getNombre() + "'," + u.getNacimiento() + "'," + u.getRun() +")";

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            stm.execute(sql);
            stm.close();

        }   catch (SQLException e) {
                e.printStackTrace();

        }



    }

    @Override
    public List<Usuario> readAll() {

        String sql = "select idUsuario, nombreUsuario, nacimientoUsuario, runUsuario";
        ArrayList <Usuario> users = new ArrayList<Usuario>();

        try {
            cn = Conexion.getConn();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                users.add(new Usuario(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("nacimientoUsuario"), rs.getInt("runUsuario") ));

            }
            rs.close();
            stm.close();



        }   catch (SQLException e) {
                e.printStackTrace();

        }
        return users;





    }



    @Override
    public Usuario readOne(int id) {








            }

    @Override
    public void update(Usuario u) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Usuario u) {

    }
}
