<%-- 
    Document   : register-sach
    Created on : May 1, 2020, 8:55:29 PM
    Author     : Tran Y
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row"
                 style="border: 1px darkgrey solid; border-radius: 10px; width: 50%; margin: 0 auto; padding: 20px;">
                <div class="col-sm-12">

                    <h2>Register</h2>
                    <form action="SachController" method="post">
                        <div class="form-group">
                            <label>Ma Sach</label> 
                            <input type="text" class="form-control" name="masach" placeholder="Enter masach" id="masach" value="">
                        </div>

                        <div class="form-group">
                            <label>Ten Sach</label> 
                            <input type="text" class="form-control" name="tensach" placeholder="Enter tensach" id="tensach" value="">
                        </div>

                        <div class="form-group">
                            <label>Ngay Nhap</label> 
                            <input type="text" class="form-control" name="ngaynhap" placeholder="Enter ngaynhap" id="ngaynhap" value="">
                        </div>
                        <div class="form-group">
                            <label>Gia Tien</label> 
                            <input type="number" class="form-control" name="giatien" placeholder="Enter giatien" id="giatien" value="0">
                        </div>
                        <div class="form-group">
                            <label>Số lượng</label> 
                            <input type="text" class="form-control" name="soluong" placeholder="Enter soluong" id="soluong" value="">
                        </div>
                        <div class="form-group">
                            <label>Loại Sách</label> 
                            <select name="loaiSach" class="form-control"> 
                                <option value=""></option>
                            </select>
                        </div>

                        <button type="submit" class="btn btn-primary">Save</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a class="btn btn-primary" href="/list">Display List User</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>


