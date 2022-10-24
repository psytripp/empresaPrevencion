<%-- 
    Document   : crearCapacitacion
    Created on : 06-10-2022, 21:19:42
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/empresaCapacitacion/CSS/estilos.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
        <div class="row">
        <div class="col-3 col-s-3 menu">
            <ul>
                <li><a href="inicio">Inicio</a></li>
                <li><a href="crearcapacitacion">Crear capacitaciones</a></li>
                <li><a href="crearusuario">Crear usuarios</a></li>
                <li><a href="contacto">Contacto</a></li>
                <li><a href="login">Login</a></li>
            </ul>
        </div>
        </nav>
    
    <section>        
    <form>
        
        <div class="form-group"> <!-- Full Name -->
            <label for="full_name_id" class="control-label">Full Name</label>
            <input type="text" class="form-control" id="full_name_id" name="Nombre" placeholder="Miguel Angel">
        </div>    

        <div class="form-group"> <!-- Street 1 -->
            <label for="street1_id" class="control-label">Street Address 1</label>
            <input type="text" class="form-control" id="street1_id" name="Direccion" placeholder="Street address, P.O. box, company name, c/o">
        </div>                    

        <div class="form-group"> <!-- Street 2 -->
            <label for="street2_id" class="control-label">Street Address 2</label>
            <input type="text" class="form-control" id="street2_id" name="street2" placeholder="Apartment, suite, unit, building, floor, etc.">
        </div>    

        <div class="form-group"> <!-- City-->
            <label for="city_id" class="control-label">City</label>
            <input type="text" class="form-control" id="city_id" name="city" placeholder="Smallville">
        </div>                                    

        <div class="form-group"> <!-- State Button -->
            <label for="state_id" class="control-label">State</label>
            <select class="form-control" id="state_id">
                <option value="AR">Arica</option>
                <option value="LS">La Serena</option>
                <option value="SCL">Santiago</option>
                <option value="CON">Concepcion</option>
                <option value="PM">Puerto Montt</option>
            </select>                    
        </div>

        <div class="form-group"> <!-- Zip Code-->
            <label for="zip_id" class="control-label">Zip Code</label>
            <input type="text" class="form-control" id="zip_id" name="zip" placeholder="#####">
        </div>        

        <div class="form-group"> <!-- Submit Button -->
            <button type="submit" class="btn btn-primary">Buy!</button>
        </div>     

    </form>
    </section>
       
       
 </body>
</html>
