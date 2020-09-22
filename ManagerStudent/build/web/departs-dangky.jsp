<%-- 
    Document   : departs-dangky
    Created on : Mar 13, 2020, 8:09:20 PM
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
                    <h2>Dang ky - Departs</h2>
                    <form action="DepartsServlet">
                        <input type="hidden" class="form-control" name="action" value="${Action}" >
                        <div class="form-group">
                            <label>ID:</label>
                            <input type="text" class="form-control" name="id" value="${Departs.id}" placeholder="Enter id">
                        </div>
                        <div class="form-group">
                            <label>NAME:</label>
                            <input type="text" class="form-control" name="name" value="${Departs.name}" placeholder="Enter name">
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="DepartsServlet?action=List" class="btn btn-primary">Display Departs</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
