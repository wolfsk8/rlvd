// app.js
$(document).ready(function() {
    $('#loadModalButton').on('click', function() {
        $('#modalContainer').load('modulo_productos.html', function() {
            $('#productModal').modal('show');
            setupModalEventListeners();
        });
    });

        const products = [
            { id: 1, name: 'Laptop', price: 999.99, stock: 10 },
            { id: 2, name: 'Smartphone', price: 499.99, stock: 20 },
            { id: 3, name: 'Tablet', price: 299.99, stock: 15 }
        ];

        // Función para cargar productos en la tabla
        function loadProducts(productList) {
            const tbody = document.getElementById('productList');
            tbody.innerHTML = '';
            productList.forEach(product => {
                const tr = document.createElement('tr');
                tr.innerHTML = `
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>$${product.price.toFixed(2)}</td>
                    <td>${product.stock}</td>
                    <td>
                        <button class="btn btn-sm btn-info" data-toggle="tooltip" title="Ver">
                            <i class="fas fa-eye"></i>
                        </button>
                        <button class="btn btn-sm btn-warning" data-toggle="tooltip" title="Modificar">
                            <i class="fas fa-edit"></i>
                        </button>
                        <button class="btn btn-sm btn-danger" data-toggle="tooltip" title="Borrar">
                            <i class="fas fa-trash-alt"></i>
                        </button>
                    </td>
                `;
                tbody.appendChild(tr);
            });
        }

        // Función para buscar productos
        function searchProducts() {
            const input = document.getElementById('searchInput').value.toLowerCase();
            const filteredProducts = products.filter(product => 
                product.name.toLowerCase().includes(input) || 
                product.id.toString().includes(input) ||
                product.price.toString().includes(input)
            );
            loadProducts(filteredProducts);
        }

        // Cargar productos al iniciar la página
        document.addEventListener('DOMContentLoaded', () => {
            loadProducts(products);
            document.getElementById('searchInput').addEventListener('input', searchProducts);
            $('[data-toggle="tooltip"]').tooltip();  // Inicializar tooltips de Bootstrap
        });
    });