# 📋 **SISTEMA DE GESTIÓN DE BARBERÍA VINTAGE**

## 🏢 **Información General**
- **Nombre**: Sistema de Gestión de Barbería Vintage
- **Tipo**: Aplicación Web Full-Stack
- **Universidad**: Universidad del Cauca
- **Autor**: José David Arteaga
- **Fecha**: Noviembre 2025

---

## 🏗️ **ARQUITECTURA DEL SISTEMA**

### **🔧 Backend - API REST (Spring Boot)**
- **Framework**: Spring Boot 3.2.0
- **Lenguaje**: Java 21
- **Base de Datos**: H2 (In-Memory)
- **Puerto**: 5000
- **ORM**: JPA/Hibernate
- **Arquitectura**: 3 Capas (Controlador, Servicio, Repositorio)

#### **Tecnologías Backend**:
- ✅ Spring Boot Starter Web
- ✅ Spring Boot Starter Data JPA
- ✅ Spring Boot DevTools
- ✅ H2 Database
- ✅ Lombok 1.18.30
- ✅ ModelMapper
- ✅ CORS habilitado

#### **Entidades Principales**:
```java
ProductoEntity {
  - id (Integer, auto-generado)
  - nombre (String)
  - descripcion (String) 
  - precio (Double)
  - categoria (String)
  - imagen (String)
  - createAt (Date)
}
```

### **🌐 Frontend - Single Page Application (Angular)**
- **Framework**: Angular 17.0.0
- **Arquitectura**: Standalone Components
- **Lenguaje**: TypeScript
- **Puerto**: 4200
- **Estilo**: Bootstrap + CSS Custom Vintage

#### **Tecnologías Frontend**:
- ✅ Angular Router
- ✅ Angular Forms (Template-driven)
- ✅ HttpClient para API calls
- ✅ SweetAlert2 para notificaciones
- ✅ Bootstrap para responsive design
- ✅ Font Awesome para iconos

---

## 📱 **FUNCIONALIDADES IMPLEMENTADAS**

### **🎯 Gestión de Servicios/Productos**
1. **➕ Registrar Nuevo Servicio**
   - Formulario completo con validaciones
   - Selector de imágenes categorizado
   - Vista previa de imagen
   - Validación en tiempo real

2. **📋 Listar Servicios**
   - Vista de tarjetas con diseño vintage
   - Filtrado por categorías
   - Búsqueda responsive
   - Efectos hover elegantes

3. **✏️ Actualizar Servicios**
   - Edición inline de servicios existentes
   - Mismo formulario que registro (reutilización)
   - Carga automática de datos

4. **🗑️ Eliminar Servicios**
   - Confirmación con SweetAlert2
   - Eliminación suave del frontend

### **📂 Categorías de Servicios**
- 🔹 **Cortes**: Diversos estilos de corte de cabello
- 🔹 **Bigote y Barba**: Arreglos y diseños
- 🔹 **Tratamientos**: Cuidados capilares especializados
- 🔹 **Productos**: Shampoos y productos de cuidado
- 🔹 **Combos**: Paquetes combinados

### **🎨 Páginas Adicionales (Borrador)**
- **💰 Ofertas**: Promociones futuras
- **🎫 Cupones**: Sistema de descuentos
- **❓ Ayuda**: Información de contacto y soporte

---

## 🎨 **DISEÑO Y ESTÉTICA**

### **🌈 Paleta de Colores Vintage**
- **🍷 Principal**: Borgoña (#7B1E1E) y Vino Tinto (#8B0000)
- **🏆 Secundario**: Dorado Viejo (#C5A572) y Mostaza (#B8860B)
- **🌊 Contraste**: Azul Petróleo (#1B3A4B) y Verde Oscuro (#2E4A3F)
- **📄 Fondo**: Beige (#F5F5DC) y Gris Claro (#EDEDED)
- **📝 Texto**: Negro Suave (#2B2B2B) y Gris Antracita (#3A3A3A)

### **✍️ Tipografía Artesanal**
- **Títulos**: Playfair Display (elegante serif)
- **Cuerpo**: Source Sans Pro (legible sans-serif)
- **Acentos**: Crimson Text (estilo vintage)

### **🎭 Efectos Visuales**
- ✨ Animaciones suaves de hover
- 🌟 Gradientes vintage
- 🎯 Sombras elegantes
- 🔄 Transiciones fluidas
- 🎨 Divisores decorativos

---

## 🗂️ **ESTRUCTURA DE ARCHIVOS**

### **Frontend (Angular)**
```
miPrimerProyecto/
├── src/app/
│   ├── header/           # Navegación principal
│   ├── footer/           # Pie de página
│   ├── cortesBarberia/   # Módulo principal
│   │   ├── listarCortes/     # Lista de servicios
│   │   ├── registrarCortes/  # Formulario CRUD
│   │   ├── modelos/          # Interfaces TypeScript
│   │   └── servicios/        # Servicios HTTP
│   ├── ofertas/          # Página de ofertas
│   ├── cupones/          # Página de cupones
│   └── ayuda/            # Página de ayuda
└── assets/images/        # Galería de imágenes
```

### **Backend (Spring Boot)**
```
proyecto_api_rest_cliente_base/
├── src/main/java/co/edu/unicauca/distribuidos/
│   ├── core/
│   │   ├── capaAccesoADatos/
│   │   │   ├── models/          # Entidades JPA
│   │   │   └── repositories/    # Repositorios
│   │   ├── capaControladores/   # Controllers REST
│   │   └── capaServicios/       # Lógica de negocio
│   └── fachadaServices/         # DTOs y mappers
└── src/main/resources/
    ├── application.properties   # Configuración
    └── data.sql                # Datos iniciales
```

---

## 🌐 **API REST ENDPOINTS**

### **📋 Productos/Servicios**
- `GET /api/productos` - Listar todos los productos
- `GET /api/productos/{id}` - Obtener producto por ID
- `POST /api/productos` - Crear nuevo producto
- `PUT /api/productos/{id}` - Actualizar producto
- `DELETE /api/productos/{id}` - Eliminar producto
- `GET /api/productos/categoria/{categoria}` - Filtrar por categoría
- `GET /api/categorias` - Obtener todas las categorías

---

## 🖼️ **GALERÍA DE IMÁGENES**

### **Imágenes Categorizadas**
- **Cortes**: 8 estilos diferentes (afro, buzzcut, punk, etc.)
- **Bigote/Barba**: 2 estilos (fino, leñador)
- **Combos**: 1 combinación
- **Productos**: 1 shampoo premium
- **Tratamientos**: 1 tratamiento capilar
- **General**: 1 imagen por defecto

---

## 🚀 **INSTALACIÓN Y EJECUCIÓN**

### **📋 Prerrequisitos**
- Java 21+
- Node.js 18+
- Angular CLI 17+
- Maven 3.9+

### **🔧 Backend (Spring Boot)**
```bash
# Navegar al directorio del backend
cd proyecto_api_rest_cliente_base

# Compilar y ejecutar
mvn spring-boot:run

# El backend estará disponible en: http://localhost:5000
```

### **🌐 Frontend (Angular)**
```bash
# Navegar al directorio del frontend
cd miPrimerProyecto

# Instalar dependencias
npm install

# Ejecutar servidor de desarrollo
ng serve

# El frontend estará disponible en: http://localhost:4200
```

### **🗄️ Base de Datos H2**
- **URL**: http://localhost:5000/h2-console
- **JDBC URL**: jdbc:h2:mem:testdb
- **Usuario**: sa
- **Contraseña**: password

---

## 📊 **PRUEBAS API**

### **🔬 Postman Collection**
Se incluye una colección de Postman para probar todos los endpoints:
- Archivo: `Pruebas_API_Barberia.postman_collection.json`
- Incluye pruebas para: Listar, Consultar, Crear, Modificar, Eliminar

### **🧪 Ejemplos de Datos**
```json
{
  "nombre": "Corte Clásico",
  "descripcion": "Corte de cabello tradicional con tijeras",
  "precio": 25000,
  "categoria": "Cortes",
  "imagen": "corte_afro.png"
}
```

---

## 🎯 **CARACTERÍSTICAS DESTACADAS**

### **💻 Responsive Design**
- ✅ Adaptable a móviles, tablets y desktop
- ✅ Navegación colapsible
- ✅ Grid system responsive
- ✅ Imágenes optimizadas

### **🎨 Experiencia de Usuario**
- ✅ Interfaz intuitiva y elegante
- ✅ Validaciones en tiempo real
- ✅ Mensajes de confirmación
- ✅ Efectos visuales suaves
- ✅ Navegación clara

### **🔧 Tecnología Moderna**
- ✅ Componentes Angular standalone
- ✅ API REST robusta
- ✅ Gestión de estado reactiva
- ✅ Arquitectura escalable

---

## 🎊 **ESTADO ACTUAL DEL PROYECTO**

### **✅ Completado**
- 🎯 Backend API REST funcional
- 🎯 Frontend Angular con todas las páginas
- 🎯 CRUD completo de productos/servicios
- 🎯 Diseño vintage implementado
- 🎯 Responsive design
- 🎯 Galería de imágenes integrada
- 🎯 Base de datos con datos de prueba
- 🎯 Validaciones y manejo de errores

### **🔄 En Desarrollo/Futuras Mejoras**
- 📊 Páginas de ofertas y cupones (funcionalidad completa)
- 🔐 Sistema de autenticación
- 📈 Dashboard administrativo
- 💳 Sistema de pagos
- 📱 App móvil nativa

---

## 🏆 **TECNOLOGÍAS Y HERRAMIENTAS**

| Categoría | Tecnología | Versión |
|-----------|------------|---------|
| **Frontend** | Angular | 17.0.0 |
| **Backend** | Spring Boot | 3.2.0 |
| **Base de Datos** | H2 Database | Embedded |
| **Lenguaje Backend** | Java | 21 |
| **Lenguaje Frontend** | TypeScript | Latest |
| **Estilos** | Bootstrap + CSS Custom | 5.x |
| **Build Tool** | Maven | 3.9+ |
| **IDE** | VS Code | - |

---

## 👤 **Autor**

**José David Arteaga**
- Universidad del Cauca
- Ingeniería de Sistemas

---

## 📄 **Licencia**

Este proyecto es desarrollado con fines educativos para la Universidad del Cauca.

---

Este proyecto representa una aplicación web moderna y completa para la gestión de servicios de barbería, combinando tecnologías de vanguardia con un diseño vintage elegante y una experiencia de usuario excepcional.