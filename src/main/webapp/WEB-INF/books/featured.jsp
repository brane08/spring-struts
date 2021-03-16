<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<h3>Featured Books</h3>
<div class="row row-cols-lg-3 row-cols-2">
    <s:iterator value="books">
        <div class="col">
            <div class="card">
                <div class="row g-0">
                    <div class="col-4">
                        <img src="" alt="Image Here!"/>
                    </div>
                    <div class="col-8">
                        <div class="card-body">
                            <h5 class="card-title"><s:property value="title"/></h5>
                            <div class="card-subtitle">Authors</div>
                            <p class="card-text"><s:property value="description"/></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </s:iterator>
</div>
