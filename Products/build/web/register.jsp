<%-- 
    Document   : register
    Created on : May 6, 2020, 9:15:20 AM
    Author     : Tran Y
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>Register</h2>
                    <form action="productsServlet">
                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Ma san pham</label>
                            <input type="text" class="form-control" name="masp" value="${PRODUCTS.masp}" placeholder="Enter masp">
                        </div>
                       <div class="form-group">
                            <label>Ten san pham</label>
                            <input type="text" class="form-control" name="tensp" value="${PRODUCTS.tensp}" placeholder="Enter tensp">
                        </div>
                        <div class="form-group">
                            <label>Ngay nhap</label>
                            <input type="date" class="form-control" name="ngaynhap" value="${PRODUCTS.ngaynhap}"  style="padding: 0px 12px" placeholder="Enter ngaynhap">
                        </div>
                        <div class="form-group">
                            <label>Gia tien</label>
                            <input type="number" class="form-control" name="giatien" value="${PRODUCTS.giatien}" placeholder="Enter giatien">
                        </div>
                        <div class="form-group">
                            <label>Soluong</label>
                            <input type="number" class="form-control" name="soluong" value="${PRODUCTS.soluong}" placeholder="Enter soluong">
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="productsServlet?action=List" class="btn btn-primary">Display products</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
