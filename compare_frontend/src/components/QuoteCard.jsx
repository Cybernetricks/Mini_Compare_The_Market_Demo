export default function QuoteCard({ quote }) {
  return (
    <div style={{ border: "1px solid black", margin: "10px", padding: "10px" }}>
      <h3>{quote.provider}</h3>
      <p>Price: £{quote.price.toFixed(2)}</p>
      <p>Excess: £{quote.excess}</p>
    </div>
  );
}