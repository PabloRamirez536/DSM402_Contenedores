package org.utleon.dsm402_contenedores;


import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import org.utleon.dsm402_contenedores.model.Sucursal;

public class SucursalController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private TableColumn<Sucursal, String> colDireccion;

    @FXML
    private TableColumn<Sucursal, String> colHorarios;

    @FXML
    private TableColumn<Sucursal, Integer> colID;

    @FXML
    private TableColumn<Sucursal, String> colNombreSucursal;

    @FXML
    private TableView<Sucursal> tblSucursal;

    @FXML
    private TextField txtCalle;

    @FXML
    private TextField txtCodigoPostal;

    @FXML
    private TextField txtColonia;

    @FXML
    private TextField txtHorarios;

    @FXML
    private TextField txtLatitud;

    @FXML
    private TextField txtLongitud;

    @FXML
    private TextField txtNombreSucursal;

    @FXML
    private TextField txtNumeroExt;

    int contador = 0;
    ObservableList<Sucursal> listSucursales;
    //Metodo inicializador o constructor
    public void initialize(){
        listSucursales = FXCollections.observableArrayList();
        colID.setCellValueFactory(col -> new SimpleObjectProperty<>(col.getValue().getIdSucursal()));
        colNombreSucursal.setCellValueFactory(col -> new SimpleObjectProperty<>(col.getValue().getNombreSucursal()));
        colDireccion.setCellValueFactory(col -> new SimpleObjectProperty<>(col.getValue().getDireccionCompleta()));
        colHorarios.setCellValueFactory(col -> new SimpleObjectProperty<>(col.getValue().getHorarios()));
        //TODO: Colocar el formato para el resto de columnas
        btnRegistrar.setOnAction(event -> {saveSucursal();});
    }

    public void loadTable(){
        tblSucursal.setItems(listSucursales);//Pasamos a nuestra tabla la lista de las sucursales
        tblSucursal.refresh();//Metodo para actualizar la tabla
    }

    public void saveSucursal(){
        Sucursal sucursal = new Sucursal();
        contador++;
        sucursal.setIdSucursal(contador);
        sucursal.setNombreSucursal(txtNombreSucursal.getText());
        sucursal.setCalle(txtCalle.getText());
        sucursal.setNumero(txtNumeroExt.getText());
        sucursal.setColonia(txtColonia.getText());
        sucursal.setCodigoPostal(txtCodigoPostal.getText());
        sucursal.setFotoSucursal(null);
        sucursal.setLatitud(txtLatitud.getText());
        sucursal.setLongitud(txtLongitud.getText());
        sucursal.setHorarios(txtHorarios.getText());
        //TODO: Cargar el resto de campos o propiedades
        listSucursales.add(sucursal);
        loadTable();
    }
    /*
    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtNombreSucursal;

    @FXML
    private TextField txtCalle;

    @FXML
    private TextField txtNumeroExt;

    @FXML
    private TextField txtColonia;

    @FXML
    private TextField txtCodigoPostal;

    @FXML
    private TextField txtLatitud;

    @FXML
    private TextField txtLongitud;

    @FXML
    private TextField txtHorarios;

    @FXML
    private TableView<Sucursal> tblSucursal;

    @FXML
    private TableColumn<Sucursal, Integer> colID;

    @FXML
    private TableColumn<Sucursal, String> colNombreSucursal;

    @FXML
    private TableColumn<Sucursal, String> colDireccion;

    @FXML
    private TableColumn<Sucursal, String> colHorarios;


    Código Mio
    ObservableList<Sucursal> sucursales;
    private int idCounter = 1;

    public void saveSucursal() {
        Sucursal sucursal = new Sucursal();
        sucursal.setIdSucursal(idCounter++);  // Asignar ID único
        sucursal.setNombreSucursal(txtNombreSucursal.getText());
        sucursal.setCalle(txtCalle.getText());
        sucursal.setNumero(txtNumeroExt.getText());
        sucursal.setColonia(txtColonia.getText());
        sucursal.setCodigoPostal(txtCodigoPostal.getText());
        sucursal.setFotoSucursal(null);
        sucursal.setLatitud(txtLatitud.getText());
        sucursal.setLongitud(txtLongitud.getText());
        sucursal.setHorarios(txtHorarios.getText());

        sucursales.add(sucursal);

        txtNombreSucursal.setText("");
        txtCalle.setText("");
        txtNumeroExt.setText("");
        txtColonia.setText("");
        txtCodigoPostal.setText("");
        txtLatitud.setText("");
        txtLongitud.setText("");
        txtHorarios.setText("");
    }

    private void inicializarTablaSucursales() {
        colID.setCellValueFactory(new PropertyValueFactory<>("idSucursal"));
        colNombreSucursal.setCellValueFactory(new PropertyValueFactory<>("nombreSucursal"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccionCompleta")); // Asignamos la propiedad personalizada
        colHorarios.setCellValueFactory(new PropertyValueFactory<>("horarios"));

        sucursales = FXCollections.observableArrayList();
        tblSucursal.setItems(sucursales);
    }
    @FXML
    private void initialize() {
        this.inicializarTablaSucursales();

    }


    Otra forma de mandar los datos:

    private void inicializarTablaSucursales() {
        colID.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIdSucursal()).asObject());
        colNombreSucursal.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombreSucursal()));
        colDireccion.setCellValueFactory(cellData -> {
            Sucursal sucursal = cellData.getValue();
            String direccionCompleta = sucursal.getCalle() + " " + sucursal.getNumero() + ", " +
                    sucursal.getColonia() + ", CP: " + sucursal.getCodigoPostal();
            return new SimpleStringProperty(direccionCompleta); // Retorna la dirección completa como una propiedad
        });
        colHorarios.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHorarios()));

        sucursales = FXCollections.observableArrayList();
        tblSucursal.setItems(sucursales);
    }

     */
}