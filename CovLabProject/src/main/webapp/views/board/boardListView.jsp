<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList, board.model.vo.Board, java.sql.Date"%>
<%
ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");
int listCount = ((Integer) request.getAttribute("listCount")).intValue();
int startPage = ((Integer) request.getAttribute("startPage")).intValue();
int endPage = ((Integer) request.getAttribute("endPage")).intValue();
int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>백신 후기</title>

<link href="/semi/resources/css/lib/font-awesome.min.css"
	rel="stylesheet">
<link href="/semi/resources/css/lib/themify-icons.css" rel="stylesheet">
<link href="/semi/resources/css/lib/menubar/sidebar.css"
	rel="stylesheet">
<link href="/semi/resources/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="/semi/resources/css/lib/helper.css" rel="stylesheet">
<link href="/semi/resources/css/style.css" rel="stylesheet">

<%@ include file="../common/sidebar.jsp"%>
<%@ include file="../common/topbar.jsp"%>

<style type="text/css">
.selectform{
	display: none;
}
</style>
<!-- <script type="text/javascript">
&(function(){
	
	
}); -->

</script>

</head>

<body>

	<div class="content-wrap">
		<div class="main">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-8 p-r-0 title-margin-right">
						<div class="page-header">
							<div class="page-title">
								<h1>
									접종 후기 <span>게시판</span>
								</h1>
							</div>
						</div>
					</div>

				</div>
				<!-- /# row -->
				<section id="main-content">
					<div class="row">
						<div class="col-lg-12">
							<div class="card">
								<!-- <div class="card-title">
                                    <h4>Bootstrap Data Table </h4>
                                    
                                </div> -->
								<div class="bootstrap-data-table-panel">
									<div class="table-responsive">
										<table class="display table table-borderd table-hover">
											<form>
												<select name="searchForm" id="search">
													<option value="selectnone">=== 검색 ===</option>
													<option value="searchboardno">글 번호</option>
													<option value="searchboardtitle">제 목</option>
													<option value="searchboardwriter">작성자</option>
													<option value="searchboarddate">작성일</option>
												</select> &nbsp;
											</form>
											<%-- 검색 항목별 값 입력 전송용 폼 만들기 --%>
											<%-- 글 번호 --%>
											<form id="noform" class="selectform" action="/semi/bsearch" method="post">
											<input type="hidden" name="action" value="no"> 
												<div>
													<input type="search" name="keyword"> &nbsp; 
													<input type="submit" value="검색">
												</div>
											</form>
											<%-- 제목 --%>
											<form id="titleform" class="selectform" actioin="/semi/bsearch" method="post">
												<input type="search" name="keyword"> &nbsp; 
												<input type="submit" value="검색">
											</form>


											<thead>
												<tr>
													<th>글 번호</th>
													<th>제 목</th>
													<th>작성자</th>
													<th>작성일</th>
													<th>조회수</th>
													<th>추천수</th>
												</tr>
											</thead>

											<tbody>
												<%
												for (Board b : list) {
												%>
												<tr>
													<td><%=b.getBoardNo()%></td>
													<td><%=b.getBoardTitle()%></td>
													<td><%=b.getBoardWriter()%></td>
													<td><%=b.getBoardDate()%></td>
													<td><%=b.getViewCnt()%></td>
													<td><%=b.getRecommendCnt()%></td>
												</tr>
												<%
												} //list:for each
												%>

											</tbody>
											<!--   <tfoot>
                                                <tr>
                                                    <th>Name</th>
                                                    <th>Position</th>
                                                    <th>Office</th>
                                                    <th>Age</th>
                                                    <th>Start date</th>
                                                    <th>Salary</th>
                                                </tr>
                                            </tfoot> -->
										</table>
									</div>
								</div>
							</div>
							<!-- /# card -->
						</div>
						<!-- /# column -->
					</div>
					<!-- /# row -->

					<div class="row">
						<div class="col-lg-12">
							<div class="footer">
								<p>
									2018 © Admin Board. - <a href="#">example.com</a>
								</p>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>




	<!-- jquery vendor -->
	<script src="/semi/resources/js/lib/jquery.min.js"></script>
	<script src="/semi/resources/js/lib/jquery.nanoscroller.min.js"></script>
	<!-- nano scroller -->
	<script src="/semi/resources/js/lib/menubar/sidebar.js"></script>
	<script src="/semi/resources/js/lib/preloader/pace.min.js"></script>
	<!-- sidebar
    
    bootstrap -->

	<script src="/semi/resources/js/lib/bootstrap.min.js"></script>
	<script src="/semi/resources/js/scripts.js"></script>
	<!--  scripit init -->
	<script src="/semi/resources/js/lib/data-table/datatables.min.js"></script>
	<script
		src="/semi/resources/js/lib/data-table/dataTables.buttons.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/jszip.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/pdfmake.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/vfs_fonts.js"></script>
	<script src="/semi/resources/js/lib/data-table/buttons.html5.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/buttons.print.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/buttons.colVis.min.js"></script>
	<script src="/semi/resources/js/lib/data-table/datatables-init.js"></script>
</body>

</html>