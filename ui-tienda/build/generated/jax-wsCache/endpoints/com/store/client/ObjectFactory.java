
package com.store.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.store.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Producto_QNAME = new QName("http://ws.store.com/", "producto");
    private final static QName _FindAllProducto_QNAME = new QName("http://ws.store.com/", "findAllProducto");
    private final static QName _EditOrden_QNAME = new QName("http://ws.store.com/", "editOrden");
    private final static QName _FindAllOrden_QNAME = new QName("http://ws.store.com/", "findAllOrden");
    private final static QName _FindAllClienteResponse_QNAME = new QName("http://ws.store.com/", "findAll_clienteResponse");
    private final static QName _FindAllOrdenResponse_QNAME = new QName("http://ws.store.com/", "findAllOrdenResponse");
    private final static QName _FindAllProductoResponse_QNAME = new QName("http://ws.store.com/", "findAllProductoResponse");
    private final static QName _RemoveProducto_QNAME = new QName("http://ws.store.com/", "removeProducto");
    private final static QName _EditProducto_QNAME = new QName("http://ws.store.com/", "editProducto");
    private final static QName _RemoveOrden_QNAME = new QName("http://ws.store.com/", "removeOrden");
    private final static QName _Orden_QNAME = new QName("http://ws.store.com/", "orden");
    private final static QName _CreateClienteDto_QNAME = new QName("http://ws.store.com/", "create_cliente_dto");
    private final static QName _CreateOrden_QNAME = new QName("http://ws.store.com/", "createOrden");
    private final static QName _RemoveClienteDto_QNAME = new QName("http://ws.store.com/", "remove_cliente_dto");
    private final static QName _FindAllCliente_QNAME = new QName("http://ws.store.com/", "findAll_cliente");
    private final static QName _Cliente_QNAME = new QName("http://ws.store.com/", "cliente");
    private final static QName _EditClienteDto_QNAME = new QName("http://ws.store.com/", "edit_cliente_dto");
    private final static QName _CreateProducto_QNAME = new QName("http://ws.store.com/", "createProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.store.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditOrden }
     * 
     */
    public EditOrden createEditOrden() {
        return new EditOrden();
    }

    /**
     * Create an instance of {@link FindAllOrden }
     * 
     */
    public FindAllOrden createFindAllOrden() {
        return new FindAllOrden();
    }

    /**
     * Create an instance of {@link FindAllOrdenResponse }
     * 
     */
    public FindAllOrdenResponse createFindAllOrdenResponse() {
        return new FindAllOrdenResponse();
    }

    /**
     * Create an instance of {@link FindAllProductoResponse }
     * 
     */
    public FindAllProductoResponse createFindAllProductoResponse() {
        return new FindAllProductoResponse();
    }

    /**
     * Create an instance of {@link RemoveProducto }
     * 
     */
    public RemoveProducto createRemoveProducto() {
        return new RemoveProducto();
    }

    /**
     * Create an instance of {@link FindAllClienteResponse }
     * 
     */
    public FindAllClienteResponse createFindAllClienteResponse() {
        return new FindAllClienteResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link FindAllProducto }
     * 
     */
    public FindAllProducto createFindAllProducto() {
        return new FindAllProducto();
    }

    /**
     * Create an instance of {@link EditClienteDto }
     * 
     */
    public EditClienteDto createEditClienteDto() {
        return new EditClienteDto();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link CreateProducto }
     * 
     */
    public CreateProducto createCreateProducto() {
        return new CreateProducto();
    }

    /**
     * Create an instance of {@link RemoveOrden }
     * 
     */
    public RemoveOrden createRemoveOrden() {
        return new RemoveOrden();
    }

    /**
     * Create an instance of {@link EditProducto }
     * 
     */
    public EditProducto createEditProducto() {
        return new EditProducto();
    }

    /**
     * Create an instance of {@link CreateClienteDto }
     * 
     */
    public CreateClienteDto createCreateClienteDto() {
        return new CreateClienteDto();
    }

    /**
     * Create an instance of {@link Orden }
     * 
     */
    public Orden createOrden() {
        return new Orden();
    }

    /**
     * Create an instance of {@link CreateOrden }
     * 
     */
    public CreateOrden createCreateOrden() {
        return new CreateOrden();
    }

    /**
     * Create an instance of {@link RemoveClienteDto }
     * 
     */
    public RemoveClienteDto createRemoveClienteDto() {
        return new RemoveClienteDto();
    }

    /**
     * Create an instance of {@link FindAllCliente }
     * 
     */
    public FindAllCliente createFindAllCliente() {
        return new FindAllCliente();
    }

    /**
     * Create an instance of {@link ClienteDto }
     * 
     */
    public ClienteDto createClienteDto() {
        return new ClienteDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAllProducto")
    public JAXBElement<FindAllProducto> createFindAllProducto(FindAllProducto value) {
        return new JAXBElement<FindAllProducto>(_FindAllProducto_QNAME, FindAllProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "editOrden")
    public JAXBElement<EditOrden> createEditOrden(EditOrden value) {
        return new JAXBElement<EditOrden>(_EditOrden_QNAME, EditOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAllOrden")
    public JAXBElement<FindAllOrden> createFindAllOrden(FindAllOrden value) {
        return new JAXBElement<FindAllOrden>(_FindAllOrden_QNAME, FindAllOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAll_clienteResponse")
    public JAXBElement<FindAllClienteResponse> createFindAllClienteResponse(FindAllClienteResponse value) {
        return new JAXBElement<FindAllClienteResponse>(_FindAllClienteResponse_QNAME, FindAllClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAllOrdenResponse")
    public JAXBElement<FindAllOrdenResponse> createFindAllOrdenResponse(FindAllOrdenResponse value) {
        return new JAXBElement<FindAllOrdenResponse>(_FindAllOrdenResponse_QNAME, FindAllOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAllProductoResponse")
    public JAXBElement<FindAllProductoResponse> createFindAllProductoResponse(FindAllProductoResponse value) {
        return new JAXBElement<FindAllProductoResponse>(_FindAllProductoResponse_QNAME, FindAllProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "removeProducto")
    public JAXBElement<RemoveProducto> createRemoveProducto(RemoveProducto value) {
        return new JAXBElement<RemoveProducto>(_RemoveProducto_QNAME, RemoveProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "editProducto")
    public JAXBElement<EditProducto> createEditProducto(EditProducto value) {
        return new JAXBElement<EditProducto>(_EditProducto_QNAME, EditProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "removeOrden")
    public JAXBElement<RemoveOrden> createRemoveOrden(RemoveOrden value) {
        return new JAXBElement<RemoveOrden>(_RemoveOrden_QNAME, RemoveOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "orden")
    public JAXBElement<Orden> createOrden(Orden value) {
        return new JAXBElement<Orden>(_Orden_QNAME, Orden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClienteDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "create_cliente_dto")
    public JAXBElement<CreateClienteDto> createCreateClienteDto(CreateClienteDto value) {
        return new JAXBElement<CreateClienteDto>(_CreateClienteDto_QNAME, CreateClienteDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "createOrden")
    public JAXBElement<CreateOrden> createCreateOrden(CreateOrden value) {
        return new JAXBElement<CreateOrden>(_CreateOrden_QNAME, CreateOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClienteDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "remove_cliente_dto")
    public JAXBElement<RemoveClienteDto> createRemoveClienteDto(RemoveClienteDto value) {
        return new JAXBElement<RemoveClienteDto>(_RemoveClienteDto_QNAME, RemoveClienteDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "findAll_cliente")
    public JAXBElement<FindAllCliente> createFindAllCliente(FindAllCliente value) {
        return new JAXBElement<FindAllCliente>(_FindAllCliente_QNAME, FindAllCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClienteDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "edit_cliente_dto")
    public JAXBElement<EditClienteDto> createEditClienteDto(EditClienteDto value) {
        return new JAXBElement<EditClienteDto>(_EditClienteDto_QNAME, EditClienteDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.store.com/", name = "createProducto")
    public JAXBElement<CreateProducto> createCreateProducto(CreateProducto value) {
        return new JAXBElement<CreateProducto>(_CreateProducto_QNAME, CreateProducto.class, null, value);
    }

}
