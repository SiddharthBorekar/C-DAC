using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace eCommerceEFCoreExample.Migrations
{
    /// <inheritdoc />
    public partial class AddedNewColInProdIsBlackListed : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<bool>(
                name: "IsBlackListed",
                table: "Products",
                type: "tinyint(1)",
                nullable: true);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "IsBlackListed",
                table: "Products");
        }
    }
}
