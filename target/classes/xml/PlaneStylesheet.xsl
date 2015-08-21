<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:pl='http://www.tc.epam.com/Plane'>
	<xsl:output method="html" />
	<xsl:template match="/">
		<html>
			<body>
				<h2>Planes</h2>
				<table border="1">
					<tr>
						<th>ID</th>
						<th>Model</th>
						<th>Origin</th>
						<th>Type</th>
						<th>Crew</th>
						<th>Loadout</th>
						<th>Radar</th>
						<th>Measurements</th>
						<th>Price</th>
					</tr>

					<xsl:for-each select="pl:Plane/pl:aircraft">
						<xsl:sort select="pl:price/attribute::cost" data-type="number"
							order="ascending" />
						<tr>
							<td>
								<xsl:value-of select="attribute::id" />
							</td>
							<td>
								<xsl:value-of select="attribute::model" />
							</td>
							<td>
								<xsl:value-of select="attribute::origin" />
							</td>
							<td>
								<xsl:value-of select="pl:characteristics/pl:type" />
							</td>
							<td>
								<xsl:value-of select="pl:characteristics/pl:crew" />
							</td>
							<td>
								<xsl:choose>
									<xsl:when test="pl:characteristics/pl:loadout">
										<xsl:value-of select="pl:characteristics/pl:loadout" />
										
									</xsl:when>
									<xsl:otherwise>
										Absent
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td>
								<xsl:choose>
									<xsl:when test="pl:characteristics/pl:radar='true'">
										+
									</xsl:when>
									<xsl:otherwise>
										-
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td>
								<xsl:value-of select="pl:measurements/attribute::height" />
								x
								<xsl:value-of select="pl:measurements/attribute::width" />
								x
								<xsl:value-of select="pl:measurements/attribute::length" />
							</td>
							<td>
								<xsl:value-of select="pl:price/attribute::cost" />
								<xsl:value-of select="pl:price/attribute::currency" />
							</td>
						</tr>
					</xsl:for-each>

				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>