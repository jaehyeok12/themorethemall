<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


내팀
<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">문서 번호</th>
				<th scope="col">결재 종류
		</th>
				<th scope="col">결재 제목</th>
				<th scope="col">작성자</th>
				<th scope="col">작성일</th>
				<th scope="col">처리 완료일</th>
				<th scope="col">처리 결과 : <select id="docStateNum" onchange="docStateSearch()">
					<option value=0>전체</option>
					<option value=2>결재 완료</option>
					<option value=3>반려</option>
				</select></th>
			</tr>
		</thead>
		<tbody id="docTeamList">

		</tbody>
		<tr id="page">
			<td colspan="8" id="paging" style="text-align: center">
				<div class="container">
					<nav aria-label="Page navigation">
						<ul class="pagination" id="pagination"></ul>
					</nav>
				</div>
			</td>
		</tr>
	</table>
	<!-- End Default Table Example -->


	<label for="inputText" class="col-form-label"> 제목 : </label>
	<input type="text" placeholder="제목 입력" name="keyword"
		id="keyword">

	<button onclick="flags(); keywordSearch(1)" class="btn btn-primary btn-sm">검색</button>
</body>

<script>
</script>





</html>